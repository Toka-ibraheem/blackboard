package Messages;


public interface IGradeAnnouncement
{
    public String prepareMessage(String[] placeHolders);
    public boolean verifyGrades();
}