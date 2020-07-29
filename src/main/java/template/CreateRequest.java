package main.java.template;

public abstract class CreateRequest {

    public final void  ctateRequest() {
        newId();
        addItems();
        saveRequest();

    }

    public abstract void newId();
    public abstract void addItems();
    public abstract void saveRequest();


}