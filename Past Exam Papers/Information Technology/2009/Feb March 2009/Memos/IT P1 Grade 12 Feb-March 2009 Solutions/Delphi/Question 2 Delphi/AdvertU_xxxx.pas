unit AdvertU_xxxx;

interface
uses SysUtils;
   type
       TAdvert = class (TObject)
         private
            fAdvertText  :string;
            fClientName  :string;
         public
          constructor create(aAdvert : string; aName :string);
          function countWords:integer;
          function isLowPolluter:boolean;
          function calculateCost:real;
          function toString:string;
          function getClientName:string;
          function getAdvertText:string;
        end;

implementation


constructor TAdvert.create(aAdvert : string; aName :string);
begin
  fAdvertText := aAdvert;
  fClientName := aName;
end;

function tAdvert.countWords:integer;
var
   iSpace, iHalfWords, iFullWords, words, half :integer;
   temp, thisWord : string;
begin

  iHalfWords := 0;
  iFullWords := 0;
  temp := fAdvertText+ ' ' ;
  iSpace := pos(' ', temp);

  While iSpace <> 0 do
    begin
      thisWord := copy(temp,1,iSpace-1);
      if thisWord <> 'LowPolluter' then
        if iSpace  <= 5 then
           inc(iHalfWords)

        else

         inc(iFullWords);


      delete(temp,1,iSpace);
      iSpace := pos(' ', temp) ;

    end;   // while
    half := Trunc(iHalfwords/2 + 0.5);
    words :=  iFullWords + half;
    Result :=  words;
 end;

 function TAdvert.isLowPolluter:boolean;
 var
   iPlace :integer;
 begin
   iPlace := pos('LowPolluter', fAdvertText);
   if iPlace > 0 then
     isLowPolluter := true
   else
     isLowPolluter := false;
 end;

 function TAdvert.calculateCost:real;
 var
   K  :integer;
   rTCost :real;
 begin
   rTCost := 0;
   rTCost := CountWords * 0.50;
   if isLowPolluter then
     rTCost := rTCost / 2;
     Result := rTCost;
end;

function TAdvert.toString:string;
var
  Discount :string;
begin

  if isLowPolluter then

    Discount := 'Discount'

  else

    Discount := 'No Discount';


    Result := 'Client: ' + fClientName + #9 + ' Word Count: ' + IntToStr(countWords) + #9 + Discount + #9 + FloatToStrF(calculateCost, ffCurrency, 6,2);
  end;


function TAdvert.getAdvertText:string;
begin
  Result := fAdvertText;
end;

function TAdvert.getClientName:string;
begin
  Result := fClientName;
end;


end.
