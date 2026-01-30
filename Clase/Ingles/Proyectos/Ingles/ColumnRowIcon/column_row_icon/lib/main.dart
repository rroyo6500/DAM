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
        body: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Container(
              color: Colors.green,
              width: 100,
              height: 100,
              child: const Center(
                child: Center(
                  child: Icon(
                    Icons.arrow_downward,
                    size: 100,
                    color: Colors.white,
                  ),
                ),
              ),
            ),
            Row(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Container(
                  color: Colors.blue,
                  width: 100,
                  height: 100,
                  child: const Center(
                    child: Icon(
                      Icons.arrow_forward,
                      size: 100,
                      color: Colors.white,
                    ),
                  ),
                ),
                Container(
                  color: Colors.blue,
                  width: 100,
                  height: 100,
                  child: const Center(
                    child: Icon(
                      Icons.arrow_forward,
                      size: 100,
                      color: Colors.white,
                    ),
                  ),
                ),
                Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Container(
                      color: Colors.red,
                      width: 100,
                      height: 100,
                      child: const Center(
                        child: Icon(
                          Icons.arrow_downward,
                          size: 100,
                          color: Colors.white,
                        ),
                      ),
                    ),
                    Row(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Container(
                          color: Colors.blue,
                          width: 100,
                          height: 100,
                          child: const Center(
                            child: Icon(
                              Icons.arrow_forward,
                              size: 100,
                              color: Colors.white,
                            ),
                          ),
                        ),
                        Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            Container(
                              color: Colors.red,
                              width: 100,
                              height: 100,
                              child: const Center(
                                child: Icon(
                                  Icons.arrow_downward,
                                  size: 100,
                                  color: Colors.white,
                                ),
                              ),
                            ),
                            Row(
                              crossAxisAlignment: CrossAxisAlignment.start,
                              children: [
                                Container(
                                  color: Colors.blue,
                                  width: 100,
                                  height: 100,
                                  child: const Center(
                                    child: Icon(
                                      Icons.arrow_forward,
                                      size: 100,
                                      color: Colors.white,
                                    ),
                                  ),
                                ),
                                Column(
                                  children: [
                                    Container(
                                      color: Colors.red,
                                      width: 100,
                                      height: 100,
                                      child: const Center(
                                        child: Icon(
                                          Icons.arrow_downward,
                                          size: 100,
                                          color: Colors.white,
                                        ),
                                      ),
                                    ),
                                    Container(
                                      color: Colors.purple,
                                      width: 100,
                                      height: 100,
                                      child: const Center(
                                        child: Icon(
                                          Icons.flag,
                                          size: 100,
                                          color: Colors.white,
                                        ),
                                      ),
                                    ),
                                  ],
                                ),
                              ],
                            ),
                          ],
                        ),
                      ],
                    ),
                  ],
                ),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
