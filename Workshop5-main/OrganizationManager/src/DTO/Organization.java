package DTO;
public abstract class Organization {
    protected int size;
    abstract public void communicateByTool();
    public Organization(){
    }
    public Organization(int size) {
        this.size = size;
    }
    public int getSize(){
        return this.size;
    }
    public void setSize(int size){
        this.size = size;
    }
    @Override
    public String toString() {
        return "the organization's size is" + this.size;
    }
}
