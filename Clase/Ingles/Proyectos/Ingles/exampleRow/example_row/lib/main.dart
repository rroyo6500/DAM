// ignore_for_file: sized_box_for_whitespace

import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        body: Padding(
          padding: const EdgeInsets.all(5.0),
          child: Column(
            children: [
              // AppBar.
              Container(
                width: double.infinity,
                height: 60,
                color: Colors.blue,
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    Padding(
                      padding: const EdgeInsets.only(left: 15),
                      child: Text(
                        "TicTacToe",
                        style: TextStyle(
                          color: Colors.white,
                          fontSize: 24,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                    ),
                    Padding(
                      padding: const EdgeInsets.only(right: 15),
                      child: Container(
                        decoration: BoxDecoration(
                          color: Colors.amber,
                          borderRadius: BorderRadius.circular(50),
                          border: Border.all(color: Colors.white, width: 2),
                        ),
                        child: Padding(
                          padding: const EdgeInsets.all(4.0),
                          child: Icon(Icons.person, color: Colors.white, size: 30),
                        ),
                      ),
                    ),
                  ],
                ),
              ),
              SizedBox(height: 50),
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Text(
                    " Start",
                    style: TextStyle(fontSize: 40, color: Colors.blue),
                  ),
                  Text(
                    "  game",
                    style: TextStyle(fontSize: 40, color: Colors.amber),
                  ),
                ],
              ),
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Container(height: 10, width: 200, color: Colors.amber),
                  Container(height: 10, width: 200, color: Colors.blue),
                ],
              ),
              SizedBox(height: 50),
              // Grid.
              Center(
                child: Container(
                  width: 300,
                  height: 300,
                  color: Colors.red,
                  child: Column(
                    children: [
                      Row(
                        children: [
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.amber,
                          ),
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.blue,
                          ),
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.amber,
                          ),
                        ],
                      ),
                      Row(
                        children: [
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.blue,
                          ),
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.amber,
                          ),
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.blue,
                          ),
                        ],
                      ),
                      Row(
                        children: [
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.amber,
                          ),
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.blue,
                          ),
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.amber,
                          ),
                        ],
                      ),
                    ],
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
