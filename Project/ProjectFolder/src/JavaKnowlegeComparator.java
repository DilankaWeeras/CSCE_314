public class JavaKnowlegeComparator
{
	/*
    Method to compare Java Knowledge between two Students
    method parameters include student 1 and student 2
    if student 1 has more knowledge than student 2 return integer 1
    if student 1 has less knowledge than student 2 return integer -1
    if student 1 has equal knowledge to student 2 return integer 0
	 */
	public static int compareJavaKnowlege(CSCE314Student s1, CSCE314Student s2)
	{
		if(s1.getJavaKnowledge() > s2.getJavaKnowledge()) {return 1;}
		else if(s1.getJavaKnowledge() == s2.getJavaKnowledge()) {return 0;}
		else {return -1;}
	}
}