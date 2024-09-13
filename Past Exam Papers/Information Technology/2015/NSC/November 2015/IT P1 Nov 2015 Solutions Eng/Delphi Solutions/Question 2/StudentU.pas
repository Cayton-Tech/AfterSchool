unit StudentU;
// A ossible solution tomQuestion 2

interface

type
   TStudent = class(TObject)
     private
       fName                  : string;
       fRegCode               : string;
       fExpiryDate            : string;
       fSessionsCompleted     : integer;

       function determineExpDate(sDate : string) : string;

     public
        constructor Create(Name, RegCode, RegDate: string);
        procedure setSessionsCompleted(iSessions : integer);
        procedure increaseSessionsCompleted;
        function evaluateProgress(iMax : integer) : string;
        function toString : string;
        function GetName : string;
        function GetCode : string;

   end;

implementation

uses SysUtils, Math;
{ TStudent }

//======   Question 2.1.1  ===================================

function TStudent.determineExpDate(sDate: string): string;
var
  iYear : integer;

begin
   iYear := StrToInt(copy(sDate,1,4)) + 2;
   result := IntToStr(iYear) + copy(sdate,5);
end;

//======   Question 2.1.2  ===================================

constructor TStudent.Create(Name, RegCode, RegDate: string);
begin
  fName        := Name;
  fRegCode     := RegCode;
  fExpiryDate  := determineExpDate(RegDate);
  fSessionsCompleted := 0;
end;


//======   Question 2.1.3  ===================================//

procedure TStudent.setSessionsCompleted(iSessions : integer);
begin
  fSessionsCompleted := iSessions;
end;

//======   Question 2.1.4  ===================================
procedure TStudent.increaseSessionsCompleted;
begin
   Inc(fSessionsCompleted, 1);
end;

//======   Question 2.1.5  ===================================
function TStudent.evaluateProgress(iMax: integer): string;
var
  iProgress : integer;
begin
   iProgress := Trunc((fSessionsCompleted / iMax) * 100);
   if iProgress >= 75 then
     Result := fName + ' qualifies as an instructor'
   else
     Result := 'Progress: ' + IntToStr(iProgress) + '% completed';
end;

//======   Question 2.1.6  ===================================
function TStudent.toString: string;
begin
   Result := fName + ' [' + fRegCode + '] ' + #13 +
             'Expiry date: ' + fExpiryDate + #13 +
             'Completed sessions: ' + IntToStr(fSessionsCompleted);
end;


//======  Methods supplied ===============================

function TStudent.GetName: string;
begin
  Result := fName;
end;

function TStudent.GetCode: string;
begin
  Result := fRegCode;
end;

//================================================================

end.
