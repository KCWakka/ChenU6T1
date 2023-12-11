public class Main {
    public static void main(String[] args) {
        int[] heights = new int[3];
        System.out.println(heights[0]);
        System.out.println(heights[1]);
        System.out.println(heights[2]);
        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;
        System.out.println(heights[0]);
        System.out.println(heights[1]);
        System.out.println(heights[2]);

        boolean[] bools = {true, false, true, false, true, false};
        bools[0] = bools[3];
        System.out.println(bools.length);
        System.out.println(bools[0]);
        System.out.println(bools[5]);

        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        String temp = alphabeticalNames[1];
        alphabeticalNames[1] = alphabeticalNames[2];
        alphabeticalNames[2] = temp;
        System.out.println(alphabeticalNames[0]);
        System.out.println(alphabeticalNames[1]);
        System.out.println(alphabeticalNames[2]);
        System.out.println(alphabeticalNames[3]);

        double[] array1 = {7.5, 10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = new double[2];
        array3[0] = array1[0] + array2[0];
        array3[1] = array1[1] * array2[1];
        System.out.println(array3[0]);
        System.out.println(array3[1]);

        String[] animal = new String[4];
        System.out.println(animal[0]);
        System.out.println(animal[1]);
        System.out.println(animal[2]);
        System.out.println(animal[3]);
        animal[0] = "dog";
        animal[1] = "camel";
        animal[2] = "aardvark";
        animal[3] = "bunny";
        System.out.println(animal[0]);
        System.out.println(animal[1]);
        System.out.println(animal[2]);
        System.out.println(animal[3]);
        animal[2] += "s";
        System.out.println(animal[2]);
        System.out.println(animal.length);
        System.out.println(animal[2].length());

        Dog dog1 = new Dog("Sparky", 4);
        Dog dog2 = new Dog("Toby", 7);
        Dog dog3 = new Dog("Fiona", 12);
        Dog[] dogs = {dog1, dog2, dog3};
        System.out.println(dogs[0].getName());
        System.out.println(dogs[1].getName());
        System.out.println(dogs[2].getName());


        int[] nums1 = {5, 8, 9, 10, 4};
        int numStr1 = 5;
        ArrayManipulator manipulator = new ArrayManipulator(nums1, numStr1);
        System.out.println("------------");
        System.out.println(manipulator.getNumsMiddleIndex());
        System.out.println(manipulator.getNumsAverage());
        System.out.println(manipulator.sameLengths());
        System.out.println(manipulator.getNumAt(3));
        System.out.println(manipulator.getWordAt(3));
        System.out.println(manipulator.updateWordsListAt(3, "hello"));
        System.out.println(manipulator.getWordAt(3));
        System.out.println(manipulator.howLongLastWord());
        System.out.println(manipulator.updateWordsListAt(4, "updated"));
        System.out.println(manipulator.howLongLastWord());




        int[] nums2 = {2, 5, 7, 9,};
        int numStr2 = 6;
        System.out.println("------------");
        manipulator = new ArrayManipulator(nums2, numStr2);
        System.out.println(manipulator.getNumsMiddleIndex());
        System.out.println(manipulator.getNumsAverage());
        System.out.println(manipulator.sameLengths());
        System.out.println(manipulator.getNumAt(3));
        System.out.println(manipulator.updateWordsListAt(6, "not valid"));
        System.out.println(manipulator.howLongLastWord());
        System.out.println(manipulator.updateWordsListAt(5, "valid"));
        System.out.println(manipulator.howLongLastWord());
    }
}