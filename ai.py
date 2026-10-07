import requests

response = requests.get(...)
data = response.json()
print(data["name"])