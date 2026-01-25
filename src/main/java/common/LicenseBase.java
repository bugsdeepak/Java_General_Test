package main.java.common;

import java.util.Properties;

/**
 * iMQ broker license base class.
 */
public class LicenseBase {
    //
    // BEGIN main.java.core licence attributes and constants.
    //

    /** License attributes. */
    protected Properties props = new Properties();

    private boolean autoChecking = true;

    // Following attributes are derived from PROP_DATE_STRING.
    private int daysToTry = 0;
    private Date expirationDate = null; // expiration date
    private Date startDate = null; // start date of valid date range

    //////// Constant values  ////////

    /** License file magic number */
    protected static final long LICENSE_MAGIC_NUMBER = 1011902605893L;

    /** The license file format version */
    private static final String CURRENT_FILE_VERSION = "4";
    //Bug 6157397  
    /** The release version */
    public static final String CURRENT_LICENSE_VERSION = "4.1";

    //////// License attribute property names ////////
    public static final String PROP_FILE_VERSION = "imq.file_version";
    public static final String PROP_LICENSE_VERSION = "imq.license_version";
    public static final String PROP_LICENSE_TYPE = "imq.license_type";
    public static final String PROP_DATE_STRING = "date_string";
    public static final String PROP_PRECEDENCE = "imq.precedence";
    public static final String PROP_DESCRIPTION = "description";

    //////// Expiration date string constants ////////
    protected static final String NONE_STRING = "NONE";
    protected static final String TRY_STRING = "TRY";
    protected static final String VALID_STRING = "VALID";
    protected static final String OPEN_BRACKET = "[";
    protected static final String CLOSE_BRACKET = "]";
    protected static final String DASH = "-";

    //////// Other (feature specific) license attributes ////////
    public static final String PROP_CLIENT_CONNLIMIT = "imq.max_client_conns";
    public static final String PROP_BROKER_CONNLIMIT = "imq.max_broker_conns";
    public static final String PROP_MAX_BACKUP_CONS = "imq.max_backup_cons";
    public static final String PROP_MAX_ACTIVE_CONS = "imq.max_active_cons";

    //////// Feature licensing ////////
    public static final String PROP_ENABLE_CLUSTER =
        "imq.enable_cluster";
    public static final String PROP_ENABLE_HTTP =
        "imq.enable_http";
    public static final String PROP_ENABLE_SSL =
        "imq.enable_ssl";
    public static final String PROP_ENABLE_SHAREDPOOL =
        "imq.enable_sharedpool";
    public static final String PROP_ENABLE_C_API =
        "imq.enable_c_api";
    public static final String PROP_ENABLE_FAILOVER =
        "imq.enable_failover";
    public static final String PROP_ENABLE_MONITORING =
        "imq.enable_monitoring";
    public static final String PROP_ENABLE_LOCALDEST =
        "imq.enable_localdest";
    
    //The following features have been added for Shrike
     public static final String PROP_ENABLE_DMQ = "imq.enable_dmq";
     public static final String PROP_ENABLE_CLIENTPING = "imq.enable_clientping";
     public static final String PROP_ENABLE_MSGBODY_COMPRESSION = "imq.enable_msgbody_compression";
     public static final String PROP_ENABLE_SHARED_SUB = "imq.enable_shared_sub";
     public static final String PROP_ENABLE_AUDIT_CCC = "imq.enable_audit_ccc";
     public static final String PROP_ENABLE_NO_ACK = "imq.enable_no_ack";
     public static final String PROP_ENABLE_RECONNECT = "imq.enable_reconnect";

    //The following features have been added for Hawk
     public static final String PROP_ENABLE_HA = "imq.enable_ha";
      
    //
    // END licence attributes and constants.
    //

}