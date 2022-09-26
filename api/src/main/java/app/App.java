package app;

import io.jooby.Jooby;

public class App extends Jooby {

  {
    mvc(new Index());
    mvc(new Adicao());
    mvc(new Divisao());
    mvc(new Subtracao());

}

  


  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
