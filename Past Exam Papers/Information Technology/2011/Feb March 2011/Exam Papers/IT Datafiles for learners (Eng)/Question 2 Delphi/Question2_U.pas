unit Question2_U;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, ComCtrls, Menus;

type
  TfrmQuest2 = class(TForm)
    redOutput: TRichEdit;
    MainMenu1: TMainMenu;
    mnuA: TMenuItem;
    mnuB: TMenuItem;
    Quit: TMenuItem;
    function jobCategory(a : String) : String;
    procedure QuitClick(Sender: TObject);
   
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  frmQuest2: TfrmQuest2;

implementation

{$R *.dfm}

const
  degreeJobs : array[1..6] of String = ('Doctor', 'Programmer', 'Architect', 'Teacher', 'Lawyer', 'Engineer');
  diplomaJobs : array[1..6] of String = ('Secretary', 'Mechanic', 'Electrician', 'Beautician', 'Nurse', 'Plumber');

function TfrmQuest2.jobCategory(a: String): String;
var
  loop : integer;
begin
   Result := 'Error';
   for loop := 1 to 6 do
     begin
       if (a = degreeJobs[loop]) then
         Result := 'Degree';
       if (a = diplomaJobs[loop])  then
         Result := 'Diploma';
     end;
end;

procedure TfrmQuest2.QuitClick(Sender: TObject);
begin
  Application.Terminate;
end;

end.
