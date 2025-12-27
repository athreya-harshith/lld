package basics;

class Student {
    int rno;
    String name;
    float marks;

    Student() {
        this(0, "");
    }

    Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
        this.marks = 0.0F;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collection");
    }
}