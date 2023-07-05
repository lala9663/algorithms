class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
            } else {
                arrayList.add(count);
                count = 0; 
            }
        }

        arrayList.add(count);

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
