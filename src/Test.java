class Test{
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while (x < 5){
			//imput code here
			y = y + 2;
			if ( y > 4 ) {
				y = y -1;
			}
			System.out.print( x + "" + y + " ");
			x = x + 1;
		}
	}
}

/*
Number 1:
y = x - y;
ans = 00 11 21 32 42


Number 2:
y = y + x;
ans = 00 11 23 36 410

Number 3:
y = y + 2;
if ( y > 4 ) {
	y = y -1;
}
ans = 12 24 35 46

Number 4:
x = x + 1;
y = y + x;

Number 5:
if ( y < 5 ) {
	x = x + 1;
	if ( y < 3 ) {
		x = x - 1;
	}
}
y = y + 2;


*/