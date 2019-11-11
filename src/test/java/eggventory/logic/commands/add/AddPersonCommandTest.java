package eggventory.logic.commands.add;

import eggventory.commons.enums.CommandType;
import eggventory.commons.exceptions.BadInputException;
import eggventory.model.PersonList;
import eggventory.model.StockList;
import eggventory.storage.Storage;
import eggventory.stubs.StorageStub;
import eggventory.stubs.UiStub;
import eggventory.ui.Ui;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


class AddPersonCommandTest {

    private StockList testStockList = new StockList();
    private Ui testCli = new UiStub();
    private Storage testStorage = new StorageStub();
    private PersonList personList = new PersonList();

    @Test
    void testExecuteAddPerson_ValidPerson_Succeeds() {
        AddPersonCommand cmd =  new AddPersonCommand(CommandType.ADD, "A12343A", "Akshay "
                + "Narayan");
        assertDoesNotThrow(() -> cmd.execute(testStockList, testCli, testStorage));
    }

    //@@author cyanoei
    @Test
    void testExecuteAddPerson_RepeatedPerson_ThrowsBadInputException() {
        AddPersonCommand cmd =  new AddPersonCommand(CommandType.ADD, "A1", "John Doe");
        assertDoesNotThrow(() -> cmd.execute(testStockList, testCli, testStorage));
        assertThrows(BadInputException.class, () -> cmd.execute(testStockList, testCli, testStorage));
    }

}