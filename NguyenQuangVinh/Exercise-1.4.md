## The following exercise is intended to encourage you to think of testing in a more rigorous way than you may be used to. The exercise also hints at the strong relationship between specification clarity, faults, and test cases

#### (a) Write a Java method with the signature public static Vector union (Vector a, Vector b) The method should return a Vector of objects that are in either of the two argument Vector

    public static Vector union (Vector a, Vector b) {
        for (Object i: b) {
            if (!a.contains(i)) {
                a.add(i);
            }
        }
        return a;
    }


#### (b) Upon reflection, you may discover a variety of defects and ambiguities in the given assignment. In other words, ample opportunities for faults exist. Describe as many possible faults as you can. (Note: Vector is a Java Collection class. If you are using another language, interpret Vector as a list.)

    The faults that I notice:
        - The objects in a vector may not be the same type
        - The objects of the 2 vectors may not the the same type
        - The 2 vectors may br null


#### (c) Create a set of test cases that you think would have a reasonable chance of revealing the faults you identified above. Document a rationale for each test in your test set. If possible, characterize all of your rationales in some concise summary. Run your tests against your implementation.

    public static boolean null_test (Vector a) {
        if (a == null) {
            return true;
        }
        return false;
    }

    public static boolean type_test (Vector a) {
        for (Object i: a) {
            if (i.getClass() != a.get(0).getClass()) {
                return true;
            }
        }
        return false;
    }

    public static boolean type_test (Vector a, Vector b) {
        for (Object i: a) {
            for (Object j: b) {
                if (i.getClass() != j.getClass()) {
                    return true;
                }
            }
        }
        return false;
    }

#### (d) Rewrite the method signature to be precise enough to clarify the defects and ambiguities identified earlier. You might wish to illustrate your specification with examples drawn from your test cases.

    public static Vector union (Vector a, Vector b) {
        if (null_test(a) && null_test(b)) {
            System.out.println("NullPointError: Vector cannot be null \n a and/or b is");
            return null;
        } 
        if (type_test(a)) {
            System.out.println("ObjectTypeError: Objects must have the same type \n a is");
            return a;
        }
        if (type_test(b)) {
            System.out.println("ObjectTypeError: Objects must have the same type \n b is");
            return b;
        }
        if (type_test(a, b)) {
            System.out.println("ObjectTypeError: Objects of the 2 Vector must have the same type");
            Vector types = new Vector<>();
            for (Object i: a) {
                if (!types.contains(i.getClass())) {
                    types.add(i.getClass());
                }
            }
            for (Object i: b) {
                if (!types.contains(i.getClass())) {
                    types.add(i.getClass());
                }
            }
            return types;
        }

        for (Object i: b) {
            if (!a.contains(i)) {
                a.add(i);
            }
        }
        return a;
    }
