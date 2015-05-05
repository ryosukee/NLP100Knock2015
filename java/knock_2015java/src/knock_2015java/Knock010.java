/**
 * 
 */
package knock_2015java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * @author ryosuke
 *
 */
public class Knock010 extends Knock {
	
	File hightemp;
	LineNumberReader lnr;
	/**
	 * 
	 */
	public Knock010() {
		hightemp = new File("../../Data/hightemp.txt");
		try {
			lnr = new LineNumberReader(new FileReader(hightemp));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/* (非 Javadoc)
	 * @see knock_2015java.Knock#start()
	 */
	@Override
	public void start() {
		try {
			String str;
			while(null != (str = lnr.readLine())){}
			System.out.println(lnr.getLineNumber());
			lnr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}