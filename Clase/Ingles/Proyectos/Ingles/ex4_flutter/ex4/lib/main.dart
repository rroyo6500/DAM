import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        backgroundColor: Colors.lime,
        body: Center(
          child: Container(
            width: 1600,
            height: 850,
            decoration: BoxDecoration(
              color: Colors.blue,
              border: Border.all(
                color: Colors.red,
                width: 5,
              ),
            ),
            child: Center(
              child: Container(
                width: 1200,
                height: 600,
                decoration: BoxDecoration(
                  color: Colors.lightGreenAccent,
                  border: Border.all(
                    color: Colors.orange,
                    width: 5,
                  ),
                  boxShadow: [
                    BoxShadow(
                      color: Colors.orange,
                      spreadRadius: 5,
                      blurRadius: 5,
                      offset: const Offset(10, 10),
                    ),
                  ]
                ),
                child: Center(
                  child: Container(
                    width: 300,
                    height: 550,
                    decoration: BoxDecoration(
                      color: Colors.red,
                      border: Border.all(
                        color: Colors.black,
                        width: 4,
                      ),
                      boxShadow: [
                        BoxShadow(
                          color: Colors.blue,
                          spreadRadius: 2,
                          blurRadius: 5,
                          offset: const Offset(5, 5),
                        ),
                        BoxShadow(
                          color: Colors.red,
                          spreadRadius: 3,
                          blurRadius: 3,
                          offset: const Offset(-5, 5),
                        ),
                      ]
                    ),
                    child: Center(
                      child: Text("Hello World!",
                        style: TextStyle(
                          fontSize: 25,
                          color: Colors.white,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                    ),
                  ),
                ),
              ),
            ),
          )
        ),
      ),
    );
  }
}
