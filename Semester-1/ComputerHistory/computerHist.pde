//Kanishka Ragula
//Computer History
void setup() {
  size(900, 400);
}

void draw() {
  strokeWeight(3/2);
  background(240,255,164);
  fill(117,17,178);
  textSize(45);
  text("Historic Computer Systems", 150, 35);
  textSize(15);
  text("The history of computing hardware covers the developments from early \nsimple devices to aid calculation to modern day computers.", 150, 60);
  strokeWeight(2);
  line(80, 180, 820, 180);
  histEvent("ENIAC - 1946", "The Electronic Numerical Integrator And Computer was the first \n electronic general-purpose computer. It was Turing-complete, digital, and \n capable of being reprogrammed to solve a large class of numerical problems.  It was secretly constructed \n at the University of Pennsylvania's Moore School of Electrical Engineering under a contract by the US Army.", 100, 110, 130, 40, 100, true);
  histEvent("IBM System/360 - 1964", "The IBM System/360 (S/360) was the first family of computers \n designed to cover the complete range of applications, from small to large, \n both commercial and scientific. The design made a clear distinction between architecture \n and implementation, allowing IBM to release a suite of compatible designs at different prices. \n It was a 32 bit computer and the chief architect was Gene Amdahl, working for IBM.", 160, 250, 200, 40, 220, false);
  histEvent("HP 2166A - 1966", "The 2116A is a 16-bit word-addressed general purpose computer.\n Main memory is 4096 words (4K), expandable to 8K of magnetic core in the mainframe, \n or 16K with a memory extender.  It was one of the first minicomputers of its time.  It was designed \n by Hewlett Packard.  The HP 2116A’s software, with a FORTRAN compiler, assembler, \n linker, loader, operating system, and I/O drivers were ready at the same time as the hardware,\n when, at the time, most computer vendors would roll out the hardware first with little software.", 260, 110, 150, 40, 240, true);
  histEvent("Intel 4004 - 1971", "The Intel 4004 is a 4-bit central processing unit (CPU)\n released by Intel Corporation in 1971. It was the first commercially available\n microprocessor by Intel.  The chip design started in April 1970, when Federico Faggin joined Intel, \n and it was completed under his leadership in January 1971. The first commercial sale of the\n fully operational 4004 occurred in March 1971 to Busicom Corp. of Japan for which it was originally\n designed and built as a custom chip.", 350, 250, 150, 40, 380, false);
  histEvent("Apple II - 1977", "The Apple II (styled as apple ][) is an 8-bit home computer,\n one of the first highly successful mass-produced microcomputer products, designed\n primarily by Steve Wozniak.  Steve Jobs oversaw the development of the Apple II's unusual case\n and Rod Holt developed the unique power supply. It was introduced in 1977 at the West Coast\n Computer Faire by Jobs and was the first consumer product sold by Apple Computer.", 460, 110, 130, 40, 500,true);
  histEvent("Sinclair ZX80 - 1980", "The Sinclair ZX80 is a home computer brought to market in \n 1980 by Science of Cambridge Ltd. (later to be better known as Sinclair Research). \n It is notable for being the first computer available in the United Kingdom for less than a hundred pounds. \n The ZX80 was very popular straight away, and for some time there was a waiting\n list of several months for either version of the machine.  I was originally designed\n by Jim Westwood and it connected directly to a household television.", 520, 250, 170, 40, 550, false);
  histEvent("Intel 80386 - 1986", "The Intel 80386 was a 32 bit processor.  The first versions had\n 275,000 transistors and were the CPU of many workstations and high-end personal computers\n of the time.  It was produced from June 1986 to September 2007.  The 80386 was first\n used in a Compaq computer.  the 80386 instruction set, programming model, and binary encodings\n are still the common denominator for all 32-bit x86 processors, which is termed the i386-architecture,\n x86, or IA-32, depending on context.", 625, 110, 160, 40, 600, true);
  histEvent("HP 95LX - 1991", "The HP 95LX (F1000A, F1010A), also known as project Jaguar, was\n the first MS-DOS pocket computer or personal digital assistant, introduced by\n Hewlett-Packard in April 1991 in collaboration with Lotus Development Corporation.  The HP 95LX had\n an NEC V20 CPU (an Intel 8088 clone running at 5.37 MHz) with an Intel Corporation System\n on a chip (SoC) device.  Its owner’s manual is larger and heavier than the computer itself. \n Other software in read-only memory (ROM) included a calculator, an appointment calendar,\n a telecommunications program, and a simple text editor.", 680, 250, 140, 40, 660, false);
  histEvent("iMac G3 - 1998", "The iMac G3 is a line of personal computers developed, manufactured,\n and sold by Apple Computer from 1998 until 2003. Noted for its innovative\n design via the use of translucent and brightly colored plastics, it was the first consumer-facing\n Apple product to debut under the recently returned interim CEO Steve Jobs. The iMac G3, among\n other factors, was responsible for Apple's turnaround from financial ruin during the late\n nineties and revitalized the Apple brand as design-oriented and simple.", 800, 110, 160, 40, 760, true);
}

void histEvent(String eventName, String dText, int xpos, int ypos, int xSize, int ySize, int timelinePos, boolean top) {
  fill(80);
  stroke(2);
  fill(251,255,37);
  rectMode(CENTER);
  rect(xpos, ypos, xSize, ySize, 15);
  if (top) { 
    line(xpos, ypos+ySize/2, timelinePos, 180);
  } else {line(xpos, ypos-ySize/2, timelinePos, 180);
}
  fill(0);
  textSize(15);
  text(eventName, xpos-xSize/2+10, ypos);

  if (mouseX >= xpos-xSize/2 && mouseX <= xpos+xSize/2 && mouseY >= ypos-ySize/2 && mouseY <= ypos+ySize/2) {

    fill(177,50,255);
    textLeading(15);
    text(dText, 50, 300);
  }
}

