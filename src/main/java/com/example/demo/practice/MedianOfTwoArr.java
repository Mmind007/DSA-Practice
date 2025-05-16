package com.example.demo.practice;

public class MedianOfTwoArr {
    public static void main(String[] args) {
        int arr1[] = {1};
        int arr2[] = {2,3,4};
        //1,2,2,3,3,4,4,5,5,6
        System.out.println("The median is "+findMedianOfTwoArrOptimal(arr1,arr2));
//        System.out.println("The median is "+findMedianOfTwoArrBrute(arr1,arr2));
    }

    private static double findMedianOfTwoArrOptimal(int[] arr1, int[] arr2) {
        int n=arr1.length+arr2.length;
        if (n==0){
            return 0;
        }
        if (n==1 &&arr1.length==1){
            return arr1[0];
        } else if (n==1 &&arr2.length==1) {
            return arr2[0];
        }
        if (arr1.length==2&&arr2.length==0){
            return (arr1[0]+arr1[1])/2.0;
        }
        if (arr2.length==2&&arr1.length==0){
            return (arr2[0]+arr2[1])/2.0;
        }
        if (n>1&&arr1.length>2&&arr2.length==0){
            if (arr1.length%2==1){
                return arr1[arr1.length/2];
            }else {
                double sum=arr1[(arr1.length/2)]+arr1[(arr1.length/2)-1];
                return sum/2;
            }
        }
        if (n>1&&arr2.length>2&&arr1.length==0){
            if (arr2.length%2==1){
                return arr2[arr2.length/2];
            }else {
                double sum=(arr2[(arr2.length/2)]+arr2[((arr2.length/2)-1)]);
                return sum/2;
            }
        }

        int i=0,j=0,count=0;
        int element1=-1;
        int element2=-1;
        int index2=n/2;
        int index1=index2-1;
        while (i<arr1.length&&j<arr2.length){
            if (arr1[i]<arr2[j]){
                if (index1==count){
                    element2=arr1[i];
                }
                if (index2==count){
                    element1=arr1[i];
                }
                i++;
                count++;
            }else {
                if (index1==count){
                    element2=arr2[j];
                }
                if (index2==count){
                    element1=arr2[j];
                }
                j++;
                count++;
            }

        }
        while (i<arr1.length){
            if (index1==count){
                element2=arr1[i];
            }
            if (index2==count){
                element1=arr1[i];
            }
            i++;
            count++;
        }
        while (j<arr1.length){
            if (index1==count){
                element2=arr2[j];
            }
            if (index2==count){
                element1=arr2[j];
            }
            j++;
            count++;
        }
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(element1);
        System.out.println(element2);
        if (n%2==1){
            return element2;
        }else {
            return (element1+element2)/2.0;
        }
    }

    private static double findMedianOfTwoArrBrute(int[] arr1, int[] arr2) {
        double median=0.0;
        int[] mergedArr=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
       while (i<arr1.length&&j<arr2.length){
           if (arr1[i]<arr2[j]){
               mergedArr[k++]=arr1[i++];
           }else {
               mergedArr[k++]=arr2[j++];
           }
       }
       while (i<arr1.length){
           mergedArr[k++]=arr1[i++];
       }
       while (j<arr2.length){
           mergedArr[k++]=arr2[j++];
       }

        if (mergedArr.length%2!=0){
            median=mergedArr[mergedArr.length/2];
            return median;
        }else {
            double sum=((mergedArr[mergedArr.length/2])+(mergedArr[(mergedArr.length / 2) - 1]));
            return sum/2;
        }

    }
}
