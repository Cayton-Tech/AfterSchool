unit ExtraItemXXXX;

interface
uses
  SysUtils;
Type
   TExtraItem = class
     private
      fGuestNum   :String;
      fItemType   :String;
      fCost       :real;

     public
      constructor Create(sGNum:String;IType:String;rCost:real);
      function getGuestNumber:String;
      function calculateProfit:real;
      function calculatePrice:real;
      function toString:String;
  end;


implementation
 constructor TExtraItem.Create(sGNum:String;IType:String;rCost:real);
      begin
        fGuestNum := sGNum;
        fItemType := IType;
        fCost := rCost;

      end;


  function TExtraItem.getGuestNumber:String;
  begin
    result := fGuestNum;
  end;

  function TExtraItem.calculateProfit:real;
  begin
    result := fCost * 25 /100;
  end;

  function TExtraItem.calculatePrice:real;
  begin
    result := calculateProfit + fCost;  // or make profit an instance field.
  end;

  function TExtraItem.toString:String;
  begin
    result := fItemType + #9 + FloatToStrF(fCost, ffCurrency, 8,2) + #9 +
               #9 +
              FloatToStrF(calculateProfit, ffCurrency, 8,2) + #9 +
              FloatToStrF(calculatePrice, ffCurrency, 8,2); // or make finalPrice an instance field
  end;


end.
