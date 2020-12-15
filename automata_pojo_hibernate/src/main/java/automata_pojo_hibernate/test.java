package automata_pojo_hibernate;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myStr = "OK|0|60||2";
		//String[] arrSplit = myStr.split("|");
		
		 String strMain = "OK|0|60||2";
		    String[] arrSplit = strMain.split("\\|");
		    for (int i=0; i < arrSplit.length; i++)
		    {
		    	System.out.println(i);
		    	System.out.println(arrSplit[i]);
		    }
		
		

	}

}
