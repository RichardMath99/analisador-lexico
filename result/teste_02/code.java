class Loop {
	int start() 
	{ 
	        int i, j, k;
	        for ( i = 2; i<= 8; i = i + 2) 
			for (j = i; j <= 4; j = j+1) 
				for (k = 1; k <= j; k = k + i) 
				print i + " " + j + " " +   k + "\n";
	 } 
}
