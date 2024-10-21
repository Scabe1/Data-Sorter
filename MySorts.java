 public class MySorts {

    // Public method that starts the merge sort process
    public static void mergesort(IList<Integer> list) {
        if (list.size() > 1) {
            IList<Integer> sorted = mergesortHelper(list);
            for (int i = 0; i < sorted.size(); i++) {
                list.set(i, sorted.get(i));
            }
        }
    }

    // Recursive helper method that performs the sorting
    private static IList<Integer> mergesortHelper(IList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }
        IList<Integer> left = getLeftHalf(list);
        IList<Integer> right = getRightHalf(list);
        left = mergesortHelper(left);
        right = mergesortHelper(right);
        return merge(left, right);
    }

    // Method to get the left half of the list
    private static IList<Integer> getLeftHalf(IList<Integer> list) {
        int size = list.size();
        IList<Integer> left = new MyArrayList<>();
        for (int i = 0; i < size / 2; i++) {
            left.add(list.get(i));
        }
        return left;
    }

    // Method to get the right half of the list
    private static IList<Integer> getRightHalf(IList<Integer> list) {
        int size = list.size();
        IList<Integer> right = new MyArrayList<>();
        for (int i = size / 2; i < size; i++) {
            right.add(list.get(i));
        }
        return right;
    }

    // Method to merge two sorted lists into one sorted list
    private static IList<Integer> merge(IList<Integer> left, IList<Integer> right) {
        IList<Integer> merged = new MyArrayList<>();
        int leftIndex = 0, rightIndex = 0;
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) <= right.get(rightIndex)) {
                merged.add(left.get(leftIndex++));
            } else {
                merged.add(right.get(rightIndex++));
            }
        }

        // Copy remaining elements of left, if any
        while (leftIndex < left.size()) {
            merged.add(left.get(leftIndex++));
        }

        // Copy remaining elements of right, if any
        while (rightIndex < right.size()) {
            merged.add(right.get(rightIndex++));
        }

        return merged;
    }
}
