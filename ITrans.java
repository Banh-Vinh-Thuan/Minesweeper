/*
Course: Algorithms & Data Structures
Period: Morning Thursday (456)
Student's name: Bành Vĩnh Thuận
Student's ID: ITITIU21323
Project: Game Minesweeper
*/

package gui;
 
import logic.Board;
import logic.Square;
 
public interface ITrans {
  Square[][] getListSquare();
 
  void play(int x, int y);
  void target(int x, int y);
  void restart();
  void undo();
  void saveToStatusStack();
  Board getBoard();
}