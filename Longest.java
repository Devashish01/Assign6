class D
{
	
	void fun()
	{
    int arr[]={5,6,3,5,7,8,9};
    
    int arr1[]={1,1,1,1,1,1,1};


    for(int i=0;i<6;i++)
    {
        for(int j=i;j<6;j++)
        {
        	if(arr[j]<arr[j+1])
            {
        		arr1[i]=arr1[i]+1;
            }
        else
            break;

        }

    }

    int maximum=arr1[0];
    for(int i=0;i<7;i++)
        if(arr1[i]>maximum)
          maximum=arr1[i];

    System.out.println("longest length subarray "+maximum);
	}
	
}
public class Longest {

    public static void main(String args[]){
    	D obj=new D();
    	obj.fun();
  }
}