public static List<Long> findSuperstarDishes(List<Long> a, int n) {

    long candidate1 = 0;
    long candidate2 = 0;

    int count1 = 0;
    int count2 = 0;

    for (long num : a) {

        if (num == candidate1) {
            count1++;
        }
        else if (num == candidate2) {
            count2++;
        }
        else if (count1 == 0) {
            candidate1 = num;
            count1 = 1;
        }
        else if (count2 == 0) {
            candidate2 = num;
            count2 = 1;
        }
        else {
            count1--;
            count2--;
        }
    }

    count1 = 0;
    count2 = 0;

    for (long num : a) {
        if (num == candidate1) {
            count1++;
        }
        else if (num == candidate2) {
            count2++;
        }
    }

    List<Long> result = new ArrayList<>();

    if (count1 > n / 3) {
        result.add(candidate1);
    }

    if (count2 > n / 3) {
        result.add(candidate2);
    }

    Collections.sort(result);

    return result;
}