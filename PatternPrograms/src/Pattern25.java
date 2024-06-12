class Pattern25{
public static void main(String args[]) {
int i, j, rows;
/* Input number of rows from user */
rows=8;
for(i=1; i<=rows; i++) {
/* Print trailing spaces */
for(j=1; j<=rows-i; j++) {
System.out.print(" ");
}
/* Print stars and center spaces */
for(j=1; j<=rows; j++) {
if(i==1 || i==rows || j==1 || j==rows)
System.out.print("*");
else
System.out.print(" ");
}
System.out.print("\n");
}
}
}