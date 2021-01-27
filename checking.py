from PyQt5 import QtWidgets, uic
import sys
import Classes as c
import CommonFunctions as cf


class Ui(QtWidgets.QMainWindow):
    def __init__(self, filePath):
        super(Ui, self).__init__()  # Call the inherited classes __init__ method
        uic.loadUi(filePath, self)  # Load the .ui file
        self.show()  # Show the GUI
        self.stackedWidget.setCurrentIndex(0)
        self.menubar.setVisible(False)
        setUpTriggersAndLinks(self)


        self.pbSave.clicked.connect(self.save_clicked())
        self.pbCancel.clicked.connect(self.cancel_clicked())
        self.stackedWidget.currentChanged(self.pageChanged())

    def save_clicked(self):
        print('Saving...')
        case = c.Case(self.leCaseName.text(), self.teDescription.toPlainText(), self.cbLocation.currentIndex(),
                      self.dtCaseDate.dateTime())
        sys.exit(app.exec_())

    def cancel_clicked(self):
        print('Cancelled.')
        sys.exit(app.exec_())

def setUpTriggersAndLinks(self):
    self.statusbar.showMessage("Ready...")
    self.actionAdd_Case.triggered.connect(lambda: self.stackedWidget.setCurrentIndex(1))
    self.actionAdd_Location.triggered.connect(lambda: self.stackedWidget.setCurrentIndex(2))
    self.actionAdd_Providers.triggered.connect(lambda: self.stackedWidget.setCurrentIndex(3))
    self.actionCDR_Import_Data.triggered.connect(lambda: self.stackedWidget.setCurrentIndex(4))
    self.actionCDR_Search_Files.triggered.connect(lambda: self.stackedWidget.setCurrentIndex(5))
    self.actionIPDR_Import_Data.triggered.connect(lambda: self.stackedWidget.setCurrentIndex(6))
    self.actionIPDR_Search_Files.triggered.connect(lambda: self.stackedWidget.setCurrentIndex(7))
    self.actionDate_wise.triggered.connect(lambda: self.stackedWidget.setCurrentIndex(8))
    self.actionTime_wise.triggered.connect(lambda: self.stackedWidget.setCurrentIndex(9))
    self.actionDate_wise_called_and_Location.triggered.connect(lambda: self.stackedWidget.setCurrentIndex(10))
    self.actionCommon_callers.triggered.connect(lambda: self.stackedWidget.setCurrentIndex(11))
    self.actionDuration_of_call.triggered.connect(lambda: self.stackedWidget.setCurrentIndex(12))
    self.pbLogin.clicked.connect(lambda: cf.login(self.txtUserName.text().strip(), self.txtPassword.text().strip(), self))
    self.lblloginunsuccessfull.hide()


app = QtWidgets.QApplication(sys.argv)
# form = MainWindow.Ui_MainWindow()
# w = QtWidgets.QMainWindow()
# form.setupUi(w)
# form.show()
window = Ui(r"E:\PycharmProjects\pyui\MainWindow.ui")
app.exec_()
