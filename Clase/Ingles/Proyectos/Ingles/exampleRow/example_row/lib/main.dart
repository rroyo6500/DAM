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
      home: Scaffold(
        body: Column(
          children: [
            Container(
              color: Colors.lightGreenAccent,
              height: 300,
              child: Row(
                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Container(
                    width: 100,
                    height: 200,
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
                    color: Colors.red,
                  ),
                  Column(
                    children: [
                          Container(
                        width: 100,
                        height: 100,
                        color: Colors.blue,
                      ),
                      Container(
                        width: 100,
                        height: 100,
                        color: Colors.red,
                      ),
                    ],
                  )
                ],
              ),
            ),
            Container(
              height: 300,
              width: double.infinity,
              child: Center(
                child: Container(
                  width: 300,
                  height: 300,
                  color: Colors.purple,
                  child: Row(
                    children: [
                      Column(
                        children: [
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.red,
                          ),
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.orange,
                          ),
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.red,
                          ),
                        ],
                      ),
                      Column(
                        children: [
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.orange,
                          ),
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.red,
                          ),
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.orange,
                          ),
                        ],
                      ),
                      Column(
                        children: [
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.red,
                          ),
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.orange,
                          ),
                          Container(
                            width: 100,
                            height: 100,
                            color: Colors.red,
                          ),
                        ],
                      )
                    ],
                  ),
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
