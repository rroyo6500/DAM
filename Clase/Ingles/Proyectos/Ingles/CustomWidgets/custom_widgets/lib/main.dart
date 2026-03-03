import 'package:custom_widgets/components/our_own_widget.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      home: Scaffold(
        body: Column(
          children: [
            OurOwnWidget(textContent: "Value 1"),
            Text("Hello World"),
            OurOwnWidget(textContent: "Value 2"),
            OurOwnWidget(textContent: "Our Widget"),
            OurOwnWidget(textContent: "This is our Widget")
          ],
        ),
      ),
    );
  }
}
