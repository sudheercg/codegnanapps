class Pattern15{
public static void main(String args[]) {
int i,j,k,sp=1;
for (i=1; i<=5; i++) {
for (k=sp; k<=5; k++) {
System.out.print(" ");
}
for (j=0; j< i; j++) {
System.out.print("*");
}
sp = sp + 1;
System.out.print("\n");
}
sp = 1;
for (i=4; i>=1; i--) {
for (k=sp; k>=0; k--) {
System.out.print(" ");
}
for (j=i; j>=1; j--) {
System.out.print("*");
}
sp = sp + 1;
System.out.print("\n");
}
}
}
