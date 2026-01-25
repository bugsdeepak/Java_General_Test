/*
 * $Id: JobReqPostType.java 147714 2011-07-14 03:20:42Z myu $
 *
 * Copyright (C) 2009 SuccessFactors, Inc.
 * All Rights Reserved
 */
package main.java.core;

import java.util.HashMap;
import java.util.Map;

/**
 * JobReqPostType -- the type of a board posting.
 *
 * @author Jeffrey Ichnowski
 * @version $Revision: 147714 $
 */
public enum JobReqPostType {
    /** Job req posting to the internal careers site. */
    INTERNAL("_internal", true),

    /** Job req posting to the external careers web site. */
    EXTERNAL("_external", true),

    /** Job req posting through the agency access web site */
    AGENCY("_agency", true),
    
    /** Job req posting to Twitter */
    TWITTER("_twitter", true),
    
    /** Adding  for posting in both internal and external sites.*/
    BOTH_EXTERNAL_INTERNAL("_external_internal", false),

    /** Job req posting to an external job board (eQuest).  The
     * JobReqPostBean's boardId will contain the name of the actual
     * external job board.  */
    JOB_BOARD(null, true),
    
    /** Job req posting to the private internal site. */
    PRIVATE_INTERNAL("_private_internal", false),

    /** Job req posting to the private internal site. */
    PRIVATE_EXTERNAL("_private_external", false);


    /** The value of the boardId column for this type.  */
    private final String _boardId;

    /** display the posting information in job req summaries.*/
    private boolean _displayInSummaries;

    /** Mapping from boardId value to JobReqPostType. */
    private static final Map<String,JobReqPostType> BOARDID_TO_POSTTYPE_MAP = new HashMap<String,JobReqPostType>();
    static {
        for (JobReqPostType type : values()) {
            if (type.boardId() != null) {
                BOARDID_TO_POSTTYPE_MAP.put(type.boardId(), type);
            }
        }
    }

    JobReqPostType(String boardId, boolean displayInSummaries) {
        assert boardId == null || boardId.startsWith("_") : "invalid standard board type";
        _boardId = boardId;
        _displayInSummaries = displayInSummaries;
    }

  public boolean isDisplayInSummaries() {
    return _displayInSummaries;
  }

  /**
     * Returns the JobReqPostType that corresponds to the boardId
     * specified.  For boardIds that correspond to external job boards
     * (eQuest), then the JOB_BOARD constant is returned.
     *
     * @param boardId the boardId value to look up
     * @return one of the JobReqPostType constants (never returns null)
     * @throws IllegalArgumentException if a constant is specified
     * that begins with "_" and is not one of the standard boardIds
     * ("_" is reserved for future internal job board types).
     */
    public static JobReqPostType forBoardId(String boardId) throws IllegalArgumentException {
        JobReqPostType type = BOARDID_TO_POSTTYPE_MAP.get(boardId);
        if (type != null) {
            return type;
        } else if (boardId != null && boardId.startsWith("_")) {
            throw new IllegalArgumentException("Invalid boardId, only standard boardIds should begin with '_'");
        } else {
            // Otherwise any string that does not begin with "_" is a
            // JOB_BOARD post (and the boardId is the ID of the extern
            // job board).
            return JOB_BOARD;
        }
    }

    /**
     * The standard ID of the postType.  Note: JOB_BOARD posts do not
     * have a standard boardId and instead specify the name of the
     * board directly.  All standard board types will be prefixed by
     * an underscore ("_").
     *
     * <p>This is the constant that is stored in the database boardId
     * column to identify the JobReqPost as a special posting.
     *
     * @return the boardId associated with this JobReqPostType
     */
    public String boardId() {
        return _boardId;
    }
} // JobReqPostType
