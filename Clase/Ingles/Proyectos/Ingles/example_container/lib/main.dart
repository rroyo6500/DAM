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
        backgroundColor: Colors.blue,
        body: Container(
          color: Colors.orange,
          // padding: const EdgeInsets.all(16.0),
          // padding: const EdgeInsets.symmetric(horizontal: 50.0, vertical: 10.0),
          padding: const EdgeInsets.only(
            left: 30.0,
            top: 50.0,
            right: 10.0,
            bottom: 70.0,
          ),
          child: const Text(
            "Hello World!",
            style: TextStyle(color: Colors.lightGreenAccent),
          ),
        ),
      ),
    );
  }
}
