package vce.model;
import java.util.StringTokenizer;
public class StudInfo
{
    private String rollnumber = "";
	private String dept = "";
    private int rno[] = new int[4];
    public StudInfo(String rollnumber)
	{
        this.rollnumber = rollnumber;
        splitString();
    }
    private void splitString()
	{
		int i = 0;
        StringTokenizer str = new StringTokenizer(rollnumber, "-");
        while(str.hasMoreTokens())
		{
            rno[i] = Integer.parseInt(str.nextToken());
            i++;
        }
    }
    public String getDepartment()
	{
        switch(rno[2])
		{
			case 732:
                dept = "Civil Engineering";
                break;
				
			case 733:
                dept = "Computer Science and Engineering";
                break;
				
			case 734:
                dept = "Electrical and Electronics Engineering";
                break;
				
			case 735:
                dept = "Electronics and Communications Engineering";
                break;
            case 736:
                dept = "Mechanical Engineering";
                break;
            case 737:
                dept = "Information Technology";
                break;
			case 748:
                dept = "Artificial Intelligence and Machine Learning";
                break;
            default :
                dept = "Wrong Input";
        }        
        return dept;        
    }
}