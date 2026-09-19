#!/usr/bin/env python3
import json
from pathlib import Path
root = Path(__file__).resolve().parents[1]
m = json.loads((root / "patches/android/manifest.json").read_text())
seen = set()
for p in m["patches"]:
    assert p["id"] not in seen
    seen.add(p["id"])
    assert (root / p["profile"]).exists()
print(f"OK: {len(seen)} profiles")
