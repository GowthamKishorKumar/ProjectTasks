Feature: Verifying AdactinHotel App details

  Scenario Outline: Verifying AdactinHotel login page with valid credentials
    Given Im on the AdactinHotel App page
    When I should  login with "<username>" , "<password>"
    And I should search, select and Book hotels with "<Location>","<Hotels>","<Room_Type>","<No_Of_Rooms>","<Check_In>","<Check_Out>","<Adults>","<Children>","<First Name>","<Last Name>","<Address>","<Card_No>","<Card_Type>","<Exp_Month>","<Exp_Year>"and"<CVV>"
    Then I should print the order id

    Examples: 
      | username  | password | Location | Hotels      | Room_Type | No_Of_Rooms | Check_In   | Check_Out  | Adults | Children | First Name | Last Name | Address | Card_No          | Card_Type | Exp_Month | Exp_Year | CVV |
      | GowthamKk | Kishore1 | Sydney   | Hotel Creek | Standard  |           1 | 22/06/2022 | 23/06/2022 |      1 |        1 | Gowtham    | KK        | Chennai | 1234567891234567 | VISA      |        12 |     2022 | 123 |
      | GowthamKk | Kishore1 | Sydney   | Hotel Creek | Standard  |           2 | 22/06/2022 | 23/06/2022 |      2 |        1 | Gowtham    | Kishor    | Chennai | 1234567891234567 | VISA      |        12 |     2022 | 123 |
      | GowthamKk | Kishore1 | Sydney   | Hotel Creek | Standard  |           2 | 22/06/2022 | 23/06/2022 |      3 |        1 | Gowtham    | K Kumar   | Chennai | 1234567891234567 | VISA      |        12 |     2022 | 123 |
      | GowthamKk | Kishore1 | Sydney   | Hotel Creek | Standard  |           3 | 22/06/2022 | 23/06/2022 |      2 |        1 | Gowtham    | KK        | Chennai | 1234567891234567 | VISA      |        12 |     2022 | 123 |
      | GowthamKk | Kishore1 | Sydney   | Hotel Creek | Standard  |           3 | 22/06/2022 | 23/06/2022 |      3 |        1 | Gowtham    | KKumar    | Chennai | 1234567891234567 | VISA      |        12 |     2022 | 123 |
      | GowthamKk | Kishore1 | Sydney   | Hotel Creek | Standard  |           1 | 22/06/2022 | 23/06/2022 |      1 |        1 | Gowtham    | KK        | Chennai | 1234567891234567 | VISA      |        12 |     2022 | 123 |
      | GowthamKk | Kishore1 | Sydney   | Hotel Creek | Standard  |           1 | 22/06/2022 | 23/06/2022 |      1 |        1 | Gowtham    | KishorK   | Chennai | 1234567891234567 | VISA      |        12 |     2022 | 123 |
      | GowthamKk | Kishore1 | Sydney   | Hotel Creek | Standard  |           2 | 22/06/2022 | 23/06/2022 |      2 |        1 | Gowtham    | KK        | Chennai | 1234567891234567 | VISA      |        12 |     2022 | 123 |
      | GowthamKk | Kishore1 | Sydney   | Hotel Creek | Standard  |           2 | 22/06/2022 | 23/06/2022 |      2 |        1 | Gowtham    | KKumar    | Chennai | 1234567891234567 | VISA      |        12 |     2022 | 123 |
      | GowthamKk | Kishore1 | Sydney   | Hotel Creek | Standard  |           3 | 22/06/2022 | 23/06/2022 |      3 |        1 | Gowtham    | KK        | Chennai | 1234567891234567 | VISA      |        12 |     2022 | 123 |
