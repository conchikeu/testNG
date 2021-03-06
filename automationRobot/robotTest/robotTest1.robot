*** Setting ***
Library    SeleniumLibrary    


*** Test Cases ***
My first
    Log    Hello!    
*** Variables ***
${Browser}        Chrome
${SiteUrl}        http://www.fb.com
${Email}    0935550601
${password}    zFounders97@!z
${tittle}    Facebook
${WarningMessage}    Login Failed!
*** Test Cases ***
Login Should Failed With Unregistered Mail Adress
    [TAGS]  InvalidLogin-UnregisteredMailError
    
    Open LinkedinPage
    Enter Email
    Enter Password
    Click Button Login
    Check Login
    Check Log out
    Click log out
    #[Teardown]    Close Browser
*** Keywords ***
 Open LinkedinPage
    ${options}=    Evaluate  sys.modules['selenium.webdriver.chrome.options'].Options()    sys
    Call Method     ${options}    add_argument    --disable-notifications
    ${driver}=    Create Webdriver    Chrome    options=${options}
    Go to    ${SiteUrl}
    # Maximize Browser Window
Enter Email
    Input Text   xpath=//*[@id="email"]     ${Email}
Enter Password
    Input Text    xpath=//*[@id="pass"]    ${password}
Click Button Login
    Click button    xpath=//*[@id="u_0_3"] | //*[@id="u_0_2"] | //*[@id="u_0_8"]//p
Check Login
    Title Should be    ${tittle}
    Log    Login Compelted
Check Log out
    Click button     xpath=//*[@id="userNavigationLabel"]
Click log out
    Click button    xpath=//*[@id="js_ce"]/div/div/ul/li[16]/a/span/span
    