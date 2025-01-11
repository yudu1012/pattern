class ConcretePrototype implements Prototype {
    private String field1;
    private int field2;

    public ConcretePrototype(String field1, int field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    public int getField2() {
        return field2;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.field1, this.field2);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{field1='" + field1 + "', field2=" + field2 + "}";
    }
}