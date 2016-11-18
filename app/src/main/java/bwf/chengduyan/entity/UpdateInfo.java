package bwf.chengduyan.entity;

public class UpdateInfo
{
  private String downloadUrl;
  private int serverVersion;
  private String[] updateLog;

  public UpdateInfo(int paramInt, String paramString, String[] paramArrayOfString)
  {
    this.serverVersion = paramInt;
    this.downloadUrl = paramString;
    this.updateLog = paramArrayOfString;
  }

  public String getDownloadUrl()
  {
    return this.downloadUrl;
  }

  public int getServerVersion()
  {
    return this.serverVersion;
  }

  public String[] getUpdateLog()
  {
    return this.updateLog;
  }

  public void setDownloadUrl(String paramString)
  {
    this.downloadUrl = paramString;
  }

  public void setServerVersion(int paramInt)
  {
    this.serverVersion = paramInt;
  }

  public void setUpdateLog(String[] paramArrayOfString)
  {
    this.updateLog = paramArrayOfString;
  }
}

/* Location:           F:\BWF_Class\09Class\classes_dex2jar.jar
 * Qualified Name:     com.dsc.chengdueye.entity.UpdateInfo
 * JD-Core Version:    0.6.2
 */