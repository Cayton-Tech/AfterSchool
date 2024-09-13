unit uCity;

interface

uses SysUtils;

type
  TCity = class
    public
      constructor Create; overload;
      procedure diplomaJob(rSalary : real);
      procedure degreeJob(rSalary : real);
      function toString : String;
    end;

implementation

{ City }

constructor TCity.Create;
begin

end;

procedure TCity.degreeJob(rSalary: real);
begin
   // inc(degreeJobs);
   // salaryTotal := salaryTotal + rSalary;
end;

procedure TCity.diplomaJob(rSalary: real);
begin
   // inc(diplomaJobs);
   // salaryTotal := salaryTotal + rSalary;
end;

function TCity.toString: String;
var
  objStr : String;
begin
  // objStr := 'City : ' + cityName + #13;
  // objStr := objStr + 'Diploma Jobs : ' + intToStr(diplomaJobs) + #9 + 'Degree Jobs : ' + intToStr(degreeJobs) + #13;

  Result := objStr;
end;

end.
