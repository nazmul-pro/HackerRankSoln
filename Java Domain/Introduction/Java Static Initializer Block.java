static Scanner scan = new Scanner(System.in);
static int B = scan.nextInt();
static int H = scan.nextInt();
static boolean flag = true;
static
{
     if(B<=0||H<=0)
    {
        flag=false ;
            System.out.print("java.lang.Exception: Breadth and height must be positive");
    } 
}