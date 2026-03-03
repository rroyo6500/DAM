import 'package:flutter/material.dart';

class OurOwnWidget extends StatelessWidget {
  const OurOwnWidget({
      super.key, 
      required this.textContent
    });

  final String textContent;

  @override
  Widget build(BuildContext context) {
    return Container(
      color: Colors.amber,
      width: 500,
      height: 100,
      child: Text(
        textContent,
        style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold, color: Colors.blue),
      ),
    );
  }
}
