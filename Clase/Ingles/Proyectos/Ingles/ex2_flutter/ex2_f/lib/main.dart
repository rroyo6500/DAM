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
        backgroundColor: Color.fromARGB(255, 225, 225, 225),
        body: Center(
          child: Container(
            decoration: BoxDecoration(
              borderRadius: BorderRadius.circular(20),
              color: Color.fromARGB(255, 228, 228, 228),
              boxShadow: [
                BoxShadow(
                  color: Colors.white,
                  blurRadius: 20,
                  offset: const Offset(-6, -6),
                ),
                BoxShadow(
                  color: Colors.grey.shade500,
                  blurRadius: 20,
                  offset: const Offset(6, 6),
                ),
              ],
            ),
            width: 250,
            height: 400,
            child: Center(
              child: Container(
                decoration: BoxDecoration(
                  borderRadius: BorderRadius.circular(20),
                  color: Color.fromARGB(255, 225, 225, 225),
                  boxShadow: [
                    BoxShadow(
                      color: Colors.white,
                      blurRadius: 20,
                      offset: const Offset(-6, -6),
                    ),
                    BoxShadow(
                      color: Colors.grey.shade500,
                      blurRadius: 20,
                      offset: const Offset(6, 6),
                    ),
                  ],
                ),
                width: 200,
                height: 100,
              ),
            ),
          ),
        ),
      ),
    );
  }
}

/*

@override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: Center(
          child: Container(
            color: Colors.blue,
            width: 250,
            height: 400,
            child: Center(
              child: Container(
                color: Colors.red,
                width: 200,
                height: 100,
              ),
            ),
          ),
        ),
      ),
    );
  }

*/
