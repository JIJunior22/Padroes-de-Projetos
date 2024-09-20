package AbstractFactory.ex01;

public class IDE {
    private Window w;
    private Scrollbar sb;


    //Construtor
    public IDE(WidgetFactory wf) {
        setLayout(wf);
    }



    public void setLayout(WidgetFactory wf) {
        w = wf.createWindow();
        sb = wf.createScrollbar();
        drawApp();
    }

    public void drawApp() {
        w.draw();
        sb.draw();
    }
}
