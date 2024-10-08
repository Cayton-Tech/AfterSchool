unit Question1U_Memo;

// A solution for Question 1

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, Buttons, ComCtrls, ExtCtrls;

type
  TfrmQuestionONE = class(TForm)
    bmbClose: TBitBtn;
    lblFormHeading: TLabel;
    grbQuest11: TGroupBox;
    grbQuest12: TGroupBox;
    grbQuest13: TGroupBox;
    grbQuest14: TGroupBox;
    lblHWeight: TLabel;
    lblHeight: TLabel;
    btnQuestion1_1: TButton;
    redQ11: TRichEdit;
    edtWeight: TEdit;
    edtHeight: TEdit;
    lblHWeight2: TLabel;
    edtGoalWeight: TEdit;
    btnQuestion1_2: TButton;
    redQ12: TRichEdit;
    lblHName: TLabel;
    edtName: TEdit;
    rgpGender: TRadioGroup;
    grbAllergy: TGroupBox;
    chkAllergy: TCheckBox;
    lblHCode: TLabel;
    btnQuestion1_3: TButton;
    edtMembershipCode: TEdit;
    btnQuestion1_4: TButton;
    redQ14: TRichEdit;
    grbQuest15: TGroupBox;
    btnQuestion1_5: TButton;
    redQ15: TRichEdit;
    procedure FormCreate(Sender: TObject);
    procedure btnQuestion1_1Click(Sender: TObject);
    procedure btnQuestion1_2Click(Sender: TObject);
    procedure btnQuestion1_3Click(Sender: TObject);
    procedure btnQuestion1_4Click(Sender: TObject);
    procedure btnQuestion1_5Click(Sender: TObject);
    procedure bmbCloseClick(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  frmQuestionONE: TfrmQuestionONE;

implementation

{$R *.dfm}
{$R+}

var
  arrMemberCodes: array [1 .. 20] of string;


  // ==================================================================
  // Question 1.1
  // ==================================================================
procedure TfrmQuestionONE.bmbCloseClick(Sender: TObject);
begin
 Application.Terminate;
end;

procedure TfrmQuestionONE.btnQuestion1_1Click(Sender: TObject);
var
  rWeight, rHeight, rBMI: real;
begin
  rWeight := StrToFloat(edtWeight.Text);
  rHeight := StrToFloat(edtHeight.Text);
  rBMI := rWeight / sqr(rHeight);
  redQ11.Clear;
  redQ11.Lines.Add('BMI = ' + FloatToStr(rBMI));
  if (rBMI < 18.5) then
    redQ11.Lines.Add('Underweight')
  else if (rBMI < 25) then
    redQ11.Lines.Add('Normal weight')
  else
    redQ11.Lines.Add('Overweight');
end;

// ==================================================================
// Question 1.2
// ==================================================================
procedure TfrmQuestionONE.btnQuestion1_2Click(Sender: TObject);
var
  rWeight, rGoalWeight: real;
  iNumdays: integer;
begin
  redQ12.Clear;
  rWeight := StrToFloat(edtWeight.Text);
  rGoalWeight := StrToFloat(edtGoalWeight.Text);
  iNumdays := 0;
  if (rWeight > rGoalWeight) then
  begin
    redQ12.Lines.Add('Day' + #9 + 'Weight');
    while (rWeight > rGoalWeight) do
    begin
      inc(iNumdays, 1);
      rWeight := rWeight - 0.375;
      redQ12.Lines.Add(IntToStr(iNumdays) + #9 + FloatToStrF(rWeight, ffFixed,
          8, 3));
    end; // while
  end // if
  else
    redQ12.Lines.Add('Invalid value entered');
end;

// ==================================================================
// Question 1.3
// ==================================================================
procedure TfrmQuestionONE.btnQuestion1_3Click(Sender: TObject);
var
  sMembershipCode, sName: String;
  A, iRandom, iNumLetters, iSum: integer;
  sCheckNum : String;
begin
  sName := Uppercase(edtName.Text);

  sMembershipCode := '';
  For A := 1 to Length(sName) do
    if NOT(sName[A] IN ['A', 'E', 'I', 'O', 'U', #32]) then
      sMembershipCode := sMembershipCode + sName[A];

  iNumLetters := length(sMembershipCode);

  case rgpGender.ItemIndex of
    0: sMembershipCode := sMembershipCode + '-F-';
    1: sMembershipCode := sMembershipCode + '-M-';
  end;

  iRandom := Random(9) + 1;
  iSum := iRandom + 10 + iNumLetters;

   sCheckNum := IntToStr(iRandom) +  IntToStr(iSum);

  sMembershipCode := sMembershipCode + sCheckNum;

  if chkAllergy.Checked then
    sMembershipCode := sMembershipCode + '*';

  edtMembershipCode.Text := sMembershipCode;

  // Alternative for replacing the vowels:
  // sMembershipCode := StringReplace(sMembershipCode, 'A', '',[rfReplaceAll, rfIgnoreCase]);
  // sMembershipCode := StringReplace(sMembershipCode, 'E', '',[rfReplaceAll, rfIgnoreCase]);
  // sMembershipCode := StringReplace(sMembershipCode, 'I', '',[rfReplaceAll, rfIgnoreCase]);
  // sMembershipCode := StringReplace(sMembershipCode, 'O', '',[rfReplaceAll, rfIgnoreCase]);
  // sMembershipCode := StringReplace(sMembershipCode, 'U', '',[rfReplaceAll, rfIgnoreCase]);
  // sMembershipCode := StringReplace(sMembershipCode, #32, '',[rfReplaceAll, rfIgnoreCase]);
end;

// ==================================================================
// Question 1.4
// ==================================================================
procedure TfrmQuestionONE.btnQuestion1_4Click(Sender: TObject);
var
  iFirst, iSecond : integer;
  sSeekGender     : string;
begin
  iFirst := Random(20) + 1;
  if pos('-M-', arrMemberCodes[iFirst]) = 0 then
    sSeekGender := '-M-'
  else
    sSeekGender := '-F-';

  repeat
    iSecond := Random(20) + 1;
  until (pos(sSeekGender, arrMemberCodes[iSecond]) > 0);

  redQ14.Clear;
  redQ14.Lines.Add('Premium members' + #13);
  redQ14.Lines.Add(arrMemberCodes[iFirst]);
  redQ14.Lines.Add(arrMemberCodes[iSecond]);
end;

// ==================================================================
// Question 1.5
// ==================================================================
procedure TfrmQuestionONE.btnQuestion1_5Click(Sender: TObject);
var
  i, j: integer;
  temp: String;
begin
  //
  for i := 1 to 19 do
    for j := i + 1 to 20 do
    begin
      if arrMemberCodes[i] > arrMemberCodes[j] then
      begin
        temp := arrMemberCodes[i];
        arrMemberCodes[i] := arrMemberCodes[j];
        arrMemberCodes[j] := temp;
      end;
    end;

    for i := 1 to 20 do
      if pos('*', arrMemberCodes[i]) > 0
      then redQ15.Lines.Add(arrMemberCodes[i]);

    for i := 1 to 20 do
      if pos('*', arrMemberCodes[i]) = 0
      then redQ15.Lines.Add(arrMemberCodes[i]);

end;

  // ==================================================================
  procedure TfrmQuestionONE.FormCreate(Sender: TObject);
  begin
    arrMemberCodes[1] := 'PRTHNMM-M-421';
    arrMemberCodes[2] := 'LYYHNBB-F-623*';
    arrMemberCodes[3] := 'DFGQWJJK-M-220*';
    arrMemberCodes[4] := 'NBVGTYY-F-926';
    arrMemberCodes[5] := 'NBGTRFSSD-F-322*';
    arrMemberCodes[6] := 'NJKYTRRTG-M-928';
    arrMemberCodes[7] := 'JBHGTYGFTR-F-121';
    arrMemberCodes[8] := 'HGTYRJJ-F-522*';
    arrMemberCodes[9] := 'KJHYTGFDDRWQ-M-830';
    arrMemberCodes[10] := 'NHYTRFDDD-M-221*';
    arrMemberCodes[11] := 'NBVGTYYGHG-M-424';
    arrMemberCodes[12] := 'CVBGFRXXS-M-726';
    arrMemberCodes[13] := 'PLIUYHGTRF-M-323';
    arrMemberCodes[14] := 'QWDFGENBG-M-423*';
    arrMemberCodes[15] := 'RBRTHNDRKS-F-525';
    arrMemberCodes[16] := 'MKJHTGFDD-M-625';
    arrMemberCodes[17] := 'SDWRQWDDG-F-726';
    arrMemberCodes[18] := 'HNGBBVFFDCCS-F-931';
    arrMemberCodes[19] := 'NMBGHFDRLP-F-121';
    arrMemberCodes[20] := 'BVCZZXGFDJK-M-122';
  end;

end.
