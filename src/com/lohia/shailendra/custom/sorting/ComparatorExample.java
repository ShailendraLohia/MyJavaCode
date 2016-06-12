/**
 * 
 */
package com.lohia.shailendra.custom.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * @author Shailendra
 *
 */
public class ComparatorExample {
	public static void main(String[] args) throws NumberFormatException, IOException {
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       
		  int N=Integer.parseInt(br.readLine().trim());
		  String s;
		  StringTokenizer st;
		  Player Player[]=new Player[N];
		  Checker check=new Checker();
		  for(int i=0;i<N;i++)
		  {
			  s=br.readLine().trim();
			  st=new StringTokenizer(s);
			  Player[i]=new Player();
			  Player[i].name=st.nextToken();
			  Player[i].score=Integer.parseInt(st.nextToken());
		  }
		 
		  Arrays.sort(Player,check.desc);
		  for(int i=0;i<Player.length;i++)
		  {
				System.out.printf("%s %s\n",Player[i].name,Player[i].score);
		  }

			
	    }
	}



class Player
{
	String name;
	int score;
}

class Checker{

	Comparator<Player> desc = new Comparator<Player>() {

       // [@Override](/Override)
        public int compare(Player p1, Player p2) {
            if(p2.score == p1.score){
                return p2.name.compareTo(p1.name);
            }else{
                return p2.score - p1.score;    
            }

    };

};
	
}


/*
 * -1 : o1 < o2 
0 : o1 == o2 
+1 : o1 > o2
*/
