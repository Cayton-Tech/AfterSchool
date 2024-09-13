unit Question3_U;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, ComCtrls, ExtCtrls, Buttons;

type
  TfrmQuestion3 = class(TForm)
    redOutput: TRichEdit;
    pnlButtons: TPanel;
    btnA: TButton;
    btnB: TButton;
    BitBtn1: TBitBtn;
    procedure FormCreate(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

   

var
  frmQuestion3: TfrmQuestion3;

implementation

{$R *.dfm}


var
  arrLearners : array[1..20] of string;




procedure TfrmQuestion3.FormCreate(Sender: TObject);



 begin
  arrLearners[1] := 'Susan Thompson,Maths:77';
  arrLearners[2] := 'Eric Ntumba,IT:89';
  arrLearners[3] := 'Sean Franklin,Accounting:70';
  arrLearners[4] := 'Mohammed Naidoo,Maths:68';
  arrLearners[5] := 'Rowan Huntley,IT:77';
  arrLearners[6] := 'Elizabeth Xaba,Economics:77';
  arrLearners[7] := 'Sue Daniels,IT:69';
  arrLearners[8] := 'Zane Shameez,Maths:90';
  arrLearners[9] := 'Mpho Anderson,Science:81';
  arrLearners[10] := 'Bryan Smith,IT:75';
  arrLearners[11] := 'Christopher Khumalo,Accounting:78';
  arrLearners[12] := 'Camilla Johnson,Science:88';
  arrLearners[13] := 'Taryn Peterson,Science:70';
  arrLearners[14] := 'Jack Nelson,Maths:68';
  arrLearners[15] := 'Joe Zimmerman,Science:76';
  arrLearners[16] := 'Gregory Thompson,IT:87';
  arrLearners[17] := 'Dwane Franklin,IT:89';
  arrLearners[18] := 'Sean Franklin,Accounting:70';
  arrLearners[19] := 'Mohammed Naidoo,Maths:68';
  arrLearners[20] := 'Cindy Mokoena,IT:70';


end;


end.
