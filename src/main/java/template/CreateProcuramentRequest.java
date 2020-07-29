package main.java.template;

public class CreateProcuramentRequest extends CreateRequest{

    @Override
    public void newId() {
        System.out.println("New id created");
    }

    @Override
    public void addItems() {
        System.out.println("Item added");
    }

    @Override
    public void saveRequest() {
        System.out.println("Request saved");
    }
}
