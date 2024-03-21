package notebook;
//hw5 ready
import notebook.controller.UserController;
import notebook.model.repository.GBRepository;
import notebook.model.repository.impl.UserRepository;
import notebook.util.DBConnector;
import notebook.view.UserView;

import static notebook.util.DBConnector.DB_PATH;
import static notebook.util.DBConnector.createDB;

public static void main(String[] args) {
    createDB();
    GBRepository fileOperation = new UserRepository(DB_PATH);
    UserRepository userRepository = new UserRepository(fileOperation);
    UserController controller = new UserController(userRepository);
    UserView view = new UserView(controller);
    view.run();
    }
