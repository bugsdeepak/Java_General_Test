package main.java.core;

public class InfoIdHashcode {
  
  private int infoId;
  
  @Override
  public int hashCode() {
    if (this.infoId == 0){
      return super.hashCode();
    }
    final int shift = 32;
    return (int)(infoId ^ (infoId >>> shift));
  }
  
  @Override
  public boolean equals(Object other) {
    if ( this == other){
      return true;
    }
    if ((other ==null) || (other.getClass() != this.getClass() ) ){
      return false;
    }
    InfoIdHashcode anEntity = (InfoIdHashcode) other;
    if (this.infoId == 0 || anEntity.infoId == 0){
      return false;
    }
    return this.infoId == anEntity.infoId;    
  }

}
