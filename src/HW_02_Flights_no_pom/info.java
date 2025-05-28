package HW_02_Flights_no_pom;

public class info {
    /*
    🔧 1. options.addArguments("--disable-blink-features=AutomationControlled");
This disables a browser feature (AutomationControlled) that reveals automation is active. Normally, Chrome sets a flag (navigator.webdriver = true) when it's being controlled by automation — this helps websites detect bots.

✅ Purpose: Makes navigator.webdriver return false, which tricks many anti-bot systems.

🔧 2. options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
By default, when Chrome is launched by Selenium, it adds the --enable-automation flag, which triggers various automation detection features.

✅ Purpose: Prevents Chrome from showing "Chrome is being controlled by automated test software" and reduces bot detection.

🔧 3. options.setExperimentalOption("useAutomationExtension", false);
Selenium includes an internal automation extension when it launches Chrome. This extension can be detected by websites.

✅ Purpose: Disables that extension, making it harder for websites to detect you're using Selenium.

🛡️ Summary — Why You Use These
These three lines are often bundled together to reduce the chances of websites detecting you're using automated tools like Selenium. They're part of a broader "stealth" technique used in automation or scraping scenarios.

However, they’re not foolproof — modern anti-bot systems (like those from Cloudflare, Akamai, or PerimeterX) still catch many bots via other signals (headless behavior, mouse movements, IP patterns, etc.).

what means  options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36");

ChatGPT said:
The line:

java
Copy
Edit
options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36");
📌 Meaning and Purpose:
This sets a custom User-Agent string for the browser that Selenium launches.

✅ What is a User-Agent?
A User-Agent is a string that your browser sends to every website to identify itself. It includes:

The browser type and version (Chrome/125.0.0.0)

The operating system (Windows NT 10.0)

Rendering engine (AppleWebKit/537.36)

Other compatibility tags

Websites use it to decide:

How to render the site

Whether you're on mobile or desktop

Whether to block access if it suspects you're a bot

🎯 Why You Set It in Selenium?
When you run Chrcaome via Selenium, it may use a default automation-related User-Agent — or one that's clearly suspicious (like HeadlessChrome). Many websites check this and block or serve captchas.

By manually setting a common User-Agent like this:

java
Copy
Edit
Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36
You're pretending to be a real user on the latest Chrome version.

🧠 Summary
This line:

Spoofs the identity of your browser

Helps bypass basic bot detection

Improves compatibility with websites that behave differently based on User-Agent

Would you like to know how to dynamically pick a random user-agent each time your script runs, for stealthier scraping?



de la daniela:
Neata, nu cred ca o sa mearga cu headless, incearca inainte:
sa iti faci un refactor la cod si sa scapi de: cod duplicat, thread.sleep sa il inlocuiesti cu wait explicit si cand termini,
 atunci pune wait explicit pt fiecare field inclusiv ca ti se deschide tabul de round trip

Cand codul o sa arate ok, o sa vezi mai usor ce modificari trebuie sa faci

De asemenea, scoate parametrii pt mac si cache si orice alta modificare care schimba browserul pana nu modifici codul

In primul rand va fi mai usor, vei invata mai multe si vei putea face debug uitandu-te
 la headers si alte elemente pe care acum nu le-ai luat in calcul

O sa iti ia minim o zi, dar vei avea cod valid si eficient pe care sa lucrezi


clase faram _____ underscore
clasele sa inceapa cu litere mari

explicit wait- cauta cum se face!!!!!! stakeoverflow


cache stuff -
atunci singura soluti  nu foarte reliable care am gasito eu ar fi asa: Folosește un proxy rezidențial sau rotativ
Proxy = IP diferit, dinamic, face ca fiecare rulare să vină "de la alt om"
Cele gratuite (publice) nu merg bine, dar unele servicii bune oferă trial:
ScraperAPI
BrightData (fost Luminati)
ProxyMesh
Oxylabs
Dacă ai buget zero: poți folosi Free Proxy List dar... nu e stabil. Ideal: proxy rotativ rezidențial (cu IP-uri reale, nu de datacenter).
ScraperAPI - Scale Data Collection with a Simple API
ScraperAPI handles proxy rotation, browsers, and CAPTCHAs so developers can scrape any page with a single API call. Web scraping with 5,000 free API calls!

si un model de imprelementare selenium cu python

from selenium import webdriver

from selenium.webdriver.chrome.options import Options

chrome_options = Options()

chrome_options.add_argument('--proxy-server=http://your_proxy_ip:port')

driver = webdriver.Chrome(options=chrome_options)

https://www.browserstack.com/guide/launch-browser-in-selenium
https://www.browserstack.com/guide/run-selenium-tests-using-firefox-driver

base – setup și teardown

pages – clasele pentru pagini

utils – utilitare comune (e.g., waits, screenshot)

tests – clasele de test


learn:

LA WAITURI MAI BINE ASTEPTAM DUPA UN ELEMENT SA APARA PE PAGINA IN LOC DE WAITUL MEU CU 3 SEC
URL se pune in pagina specifica de ex, sau o clasa speciala cu URLs



     */
}
