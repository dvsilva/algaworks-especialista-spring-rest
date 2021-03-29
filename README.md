# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 25-18-permitindo-a-leitura-de-parametros-do-parameter-store-pelo-servico-do-amazon-ecs
git add .
git commit -m "Permitindo a leitura de parâmetros do Parameter Store pelo serviço do Amazon ECS"
git push origin 25-18-permitindo-a-leitura-de-parametros-do-parameter-store-pelo-servico-do-amazon-ecs

git checkout master
git merge --no-ff 25-18-permitindo-a-leitura-de-parametros-do-parameter-store-pelo-servico-do-amazon-ecs
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```

configurar hosts

127.0.0.1       api.algafood.local
127.0.0.1       auth.algafood.local
127.0.0.1       www.algafood.local
127.0.0.1       www.matafome.local
127.0.0.1       www.foodanalytics.local

gerar encode (https://bcrypt-generator.com)
algafood-web - web123
foodanalytics - food123
faturamento - faturamento123