//Kanishka Ragula //<>//
//Calculator Project


CalcButton[] numButtons = new CalcButton[10];
CalcButton[] spButtons = new CalcButton[5];
CalcButton[] opButtons = new CalcButton[20];

String displayValue = "0";
String valueToCompute = " ";  //string value left of operator
String valueToCompute2 = " "; //string value right of operator
float valueToComputeI = 0;    //float falue left of operator
float valueToComputeI2 = 0;   //float falue right of operator
float memory;
float result = 0;
char opValue = '+';
boolean firstNum, decOn, degree;
color bg = #FFF8C9;
void setup() {
  size(600, 460);
  background(#FFF8C9);
  noFill();
  strokeWeight(3);
  stroke(200);
  //Populate numbers
  numButtons[0] = new CalcButton(165, 410).asNumber(0, 130, 60);
  numButtons[1] = new CalcButton(130, 340).asNumber(1, 60, 60);
  numButtons[2] = new CalcButton(200, 340).asNumber(2, 60, 60);
  numButtons[3] = new CalcButton(270, 340).asNumber(3, 60, 60);
  numButtons[4] = new CalcButton(130, 270).asNumber(4, 60, 60);
  numButtons[5] = new CalcButton(200, 270).asNumber(5, 60, 60);
  numButtons[6] = new CalcButton(270, 270).asNumber(6, 60, 60);
  numButtons[7] = new CalcButton(130, 200).asNumber(7, 60, 60);
  numButtons[8] = new CalcButton(200, 200).asNumber(8, 60, 60);
  numButtons[9] = new CalcButton(270, 200).asNumber(9, 60, 60);
  //Populate operators
  opButtons[0] = new CalcButton(520, 240).isOp("+", 60, 60, false);
  opButtons[1] = new CalcButton(520, 170).isOp("-", 60, 60, false);
  opButtons[2] = new CalcButton(520, 380).isOp("=", 60, 60, false);
  opButtons[3] = new CalcButton(450, 170).isOp("÷", 60, 60, false);
  opButtons[4] = new CalcButton(380, 240).isOp("√", 60, 60, false);
  opButtons[5] = new CalcButton(450, 310).isOp("x²", 60, 60, false);
  opButtons[6] = new CalcButton(450, 240).isOp("×", 60, 60, false);
  opButtons[7] = new CalcButton(20, 240).isOp("Clear", 70, 60, true);
  opButtons[8] = new CalcButton(520, 310).isOp("+/-", 60, 60, false);
  opButtons[9] = new CalcButton(380, 310).isOp("%", 60, 60, false);
  opButtons[10] = new CalcButton(380, 170).isOp("xⁿ", 60, 60, false);
  opButtons[11] = new CalcButton(380, 380).isOp("1/x", 60, 60, false);
  opButtons[12] = new CalcButton(450, 380).isOp("BG", 60, 60, false);
  opButtons[13] = new CalcButton(310, 170).isOp("ⁿ√", 60, 60, false);
  opButtons[14] = new CalcButton(310, 240).isOp("sin", 60, 60, false);
  opButtons[15] = new CalcButton(310, 310).isOp("cos", 60, 60, false);
  opButtons[16] = new CalcButton(310, 380).isOp("tan", 60, 60, false);
  opButtons[17] = new CalcButton(20, 170).isOp("CE", 70, 60, true);
  opButtons[18] = new CalcButton(20, 310).isOp("Mode", 70, 60, false);
  opButtons[19] = new CalcButton(20, 380).isOp("π", 70, 60, false);
  spButtons[0] = new CalcButton(270, 410).isSp(".", 60, 60, false);
  spButtons[1] = new CalcButton(20, 100).isSp("M+", 125, 50, true);
  spButtons[2] = new CalcButton(165, 100).isSp("M-", 125, 50, true);
  spButtons[3] = new CalcButton(310, 100).isSp("M Clear", 125, 50, true);
  spButtons[4] = new CalcButton(455, 100).isSp("M Recall", 125, 50, true);
  //Make first num true
  firstNum = true;
}

void draw() {
  background(bg);
  for (int i=0; i<numButtons.length; i++) {
    numButtons[i].display();
    numButtons[i].hoverButton(mouseX, mouseY);
  }
  for (int i=0; i<opButtons.length; i++) {
    opButtons[i].display();
    opButtons[i].hoverButton(mouseX, mouseY);
  }

  for (int i=0; i<spButtons.length; i++) {
    spButtons[i].display();
    spButtons[i].hoverButton(mouseX, mouseY);
  }
  updateDisplay();
}

void performCalc() {
  valueToComputeI = float(valueToCompute);
  valueToComputeI2 = float(valueToCompute2);
  if (opValue == '+') {
    result = valueToComputeI + valueToComputeI2;
    displayValue = str(result);
  } else if (opValue == '*') {
    result = valueToComputeI * valueToComputeI2;
    displayValue = str(result);
  } else if (opValue == '-') {
    result = valueToComputeI - valueToComputeI2;
    displayValue = str(result);
  } else if (opValue == '÷') {
    result = valueToComputeI / valueToComputeI2;
    displayValue = str(result);
  } else if (opValue == '^') {
    result = pow(valueToComputeI, valueToComputeI2);
    displayValue = str(result);
  } else if (opValue == 'r') {
    result = pow(valueToComputeI, 1/(valueToComputeI2));
    displayValue = str(result);
  }
  valueToCompute = str(result);
  valueToComputeI = result;
  decOn = true;
}

void updateDisplay() {
  stroke(0);
  strokeWeight(2);
  fill(#DAE8FC);
  rect(20, 20, 560, 70, 10);
  fill(0);
  textSize(25);
  text(displayValue, 30, 50);
  if (memory != 0) {
    textSize(15);
    text("M", 560, 80);
  }
  if (degree == true) {
    textSize(15);
    text("deg", 60, 80);
  } else {
    textSize(15);
    text("rad", 60, 80);
  }
}

void mousePressed() {
  for (int i=0; i<numButtons.length; i++) {
    numButtons[i].clickButton(mouseX, mouseY);
    if (numButtons[i].overBox) {
      if (firstNum) {
        println(i + " " + numButtons[i].numButVal);
        valueToCompute += int(numButtons[i].numButVal);
        displayValue = valueToCompute;
      } else {
        valueToCompute2 += int(numButtons[i].numButVal);
        displayValue = valueToCompute2;
      }
    }
  }
  //Op Clicking
  for (int i=0; i<opButtons.length; i++) {
    opButtons[i].clickButton(mouseX, mouseY);
    if (opButtons[i].overBox) {
      if (opButtons[i].opVal == "+") {
        if (result !=0) {
          opValue = '+';
          valueToCompute2 = " ";
          firstNum = false;
          displayValue = "+";
          decOn = false;
        } else {
          opValue = '+';
          firstNum = false;
          valueToCompute2 = " ";
          displayValue = "+";
          decOn = false;
        }
      } else if (opButtons[i].opVal == "=") {
        firstNum = true;
        performCalc();
      } else if (opButtons[i].opVal == "Clear") {
        displayValue = "0";
        valueToCompute = " ";
        valueToCompute2 = " ";
        valueToComputeI = 0;
        valueToComputeI2 = 0;
        decOn = false;
      } else if (opButtons[i].opVal == "CE") {
        if (firstNum) {
          valueToCompute = "0";
          displayValue = valueToCompute;
        } else {
          valueToCompute2 = "0";
          displayValue = valueToCompute;
        }
        decOn = false;
      } else if (opButtons[i].opVal == "×") {
        if (result !=0) {
          opValue = '*';
          valueToCompute2 = " ";
          firstNum = false;
          displayValue = "×";
          decOn = false;
        } else {
          opValue = '*';
          firstNum = false;
          valueToCompute2 = " ";
          displayValue = "×";
          decOn = false;
        }
      } else if (opButtons[i].opVal == "-") {
        if (result !=0) {
          opValue = '-';
          valueToCompute2 = " ";
          firstNum = false;
          displayValue = "-";
          decOn = false;
        } else {
          opValue = '-';
          firstNum = false;
          valueToCompute2 = " ";
          displayValue = "-";
          decOn = false;
        }
      } else if (opButtons[i].opVal == "÷") {
        if (result !=0) {
          opValue = '÷';
          valueToCompute2 = " ";
          firstNum = false;
          displayValue = "÷";
          decOn = false;
        } else {
          opValue = '÷';
          firstNum = false;
          valueToCompute2 = " ";
          displayValue = "÷";
          decOn = false;
        }
      } else if (opButtons[i].opVal == "√") {
        if (firstNum) {
          valueToComputeI = sqrt(float(valueToCompute));
          valueToCompute = str(valueToComputeI);
          displayValue = str(valueToComputeI);
        } else {
          valueToComputeI2 = sqrt(float(valueToCompute2));
          valueToCompute2 = str(valueToComputeI2);
          displayValue = str(valueToComputeI);
        }
      } else if (opButtons[i].opVal == "x²") {
        if (firstNum) {
          valueToComputeI = sq(float(valueToCompute));
          valueToCompute = str(valueToComputeI);
          displayValue = str(valueToComputeI);
        } else {
          valueToComputeI2 = sq(float(valueToCompute2));
          valueToCompute2 = str(valueToComputeI2);
          displayValue = str(valueToComputeI);
        }
      } else if (opButtons[i].opVal == "+/-") {
        if (firstNum) {
          valueToComputeI = -1 * float(valueToCompute);
          valueToCompute = str(valueToComputeI);
          displayValue = str(valueToComputeI);
        } else {
          valueToComputeI2 = -1 * float(valueToCompute2);
          valueToCompute2 = str(valueToComputeI2);
          displayValue = str(valueToComputeI);
        }
      } else if (opButtons[i].opVal == "%") {
        if (firstNum) {
          valueToComputeI = .01 * float(valueToCompute);
          valueToCompute = str(valueToComputeI);
          displayValue = str(valueToComputeI);
        } else {
          valueToComputeI2 = .01 * float(valueToCompute2);
          valueToCompute2 = str(valueToComputeI2);
          displayValue = str(valueToComputeI);
        }
      } else if (opButtons[i].opVal == "xⁿ") {
        if (result !=0) {
          opValue = '^';
          valueToCompute2 = " ";
          firstNum = false;
          displayValue = "^";
          decOn = false;
        } else {
          opValue = '^';
          firstNum = false;
          valueToCompute2 = " ";
          displayValue = "^";
          decOn = false;
        }
      } else if (opButtons[i].opVal == "ⁿ√") {
        if (result !=0) {
          opValue = 'r';
          valueToCompute2 = " ";
          firstNum = false;
          displayValue = "ⁿ√";
          decOn = false;
        } else {
          opValue = 'r';
          firstNum = false;
          valueToCompute2 = " ";
          displayValue = "ⁿ√";
          decOn = false;
        }
      } else if (opButtons[i].opVal == "1/x") {
        if (firstNum) {
          valueToComputeI = 1/ (float(valueToCompute));
          valueToCompute = str(valueToComputeI);
          displayValue = str(valueToComputeI);
        } else {
          valueToComputeI2 = 1/ (float(valueToCompute2));
          valueToCompute2 = str(valueToComputeI2);
          displayValue = str(valueToComputeI);
        }
      } else if (opButtons[i].opVal == "sin") {
        if (degree == false) {
          if (firstNum) {
            valueToComputeI = sin(float(valueToCompute));
            valueToCompute = str(valueToComputeI);
            displayValue = str(valueToComputeI);
          } else {
            valueToComputeI2 = sin(float(valueToCompute2));
            valueToCompute2 = str(valueToComputeI2);
            displayValue = str(valueToComputeI);
          }
        } else {
          if (firstNum) {
            valueToComputeI = sin(float(valueToCompute)/180*PI);
            valueToCompute = str(valueToComputeI);
            displayValue = str(valueToComputeI);
          } else {
            valueToComputeI2 = sin(float(valueToCompute2)/180*PI);
            valueToCompute2 = str(valueToComputeI2);
            displayValue = str(valueToComputeI);
          }
        }
      } else if (opButtons[i].opVal == "cos") {
        if (degree == false) {
          if (firstNum) {
            valueToComputeI = cos(float(valueToCompute));
            valueToCompute = str(valueToComputeI);
            displayValue = str(valueToComputeI);
          } else {
            valueToComputeI2 = cos(float(valueToCompute2));
            valueToCompute2 = str(valueToComputeI2);
            displayValue = str(valueToComputeI);
          }
        } else {
          if (firstNum) {
            valueToComputeI = cos(float(valueToCompute)/180*PI);
            valueToCompute = str(valueToComputeI);
            displayValue = str(valueToComputeI);
          } else {
            valueToComputeI2 = cos(float(valueToCompute2)/180*PI);
            valueToCompute2 = str(valueToComputeI2);
            displayValue = str(valueToComputeI);
          }
        }
      } else if (opButtons[i].opVal == "tan") {
        if (degree == false) {
          if (firstNum) {
            valueToComputeI = tan(float(valueToCompute));
            valueToCompute = str(valueToComputeI);
            displayValue = str(valueToComputeI);
          } else {
            valueToComputeI2 = tan(float(valueToCompute2));
            valueToCompute2 = str(valueToComputeI2);
            displayValue = str(valueToComputeI);
          }
        } else {
          if (firstNum) {
            valueToComputeI = tan(float(valueToCompute)/180*PI);
            valueToCompute = str(valueToComputeI);
            displayValue = str(valueToComputeI);
          } else {
            valueToComputeI2 = tan(float(valueToCompute2)/180*PI);
            valueToCompute2 = str(valueToComputeI2);
            displayValue = str(valueToComputeI);
          }
        }
      } else if (opButtons[i].opVal == "BG") {
        bg = color(random(0, 255), random(0, 255), random(0, 255));
      } else if (opButtons[i].opVal == "π") {
        if (firstNum) {
          valueToCompute = str(PI);
          displayValue = valueToCompute;
          decOn = true;
        } else {
          valueToCompute2 = str(PI);
          displayValue = valueToCompute2;
          decOn = true;
        }
      } else if (opButtons[i].opVal == "Mode") {
        if (degree == false) {
          degree = true;
        } else {
          degree = false;
        }
      }
    }
  }
  //Sp Clicking
  for (int i=0; i<spButtons.length; i++) {
    spButtons[i].clickButton(mouseX, mouseY);
    if (spButtons[i].overBox) {
      if (spButtons[i].spVal == ".") {
        if (decOn == false) {
          if (firstNum) {
            valueToCompute += spButtons[i].spVal;
            displayValue = valueToCompute;
            decOn = true;
          } else {
            valueToCompute2 += spButtons[i].spVal;
            displayValue = valueToCompute2;
            decOn = true;
          }
        }
      } else if (spButtons[i].spVal == "M+") {
        if (firstNum) {
          memory += float(valueToCompute);
        } else {
          memory += float(valueToCompute2);
        }
      } else if (spButtons[i].spVal == "M-") {
        if (firstNum) {
          memory -= float(valueToCompute);
        } else {
          memory -= float(valueToCompute2);
        }
      } else if (spButtons[i].spVal == "M Clear") {
        memory = 0;
      } else if (spButtons[i].spVal == "M Recall") {
        if (firstNum) {
          valueToCompute = str(memory);
          displayValue = valueToCompute;
        } else {
          valueToCompute2 = str(memory);
          displayValue = valueToCompute2;
        }
      }
    }
  }
}